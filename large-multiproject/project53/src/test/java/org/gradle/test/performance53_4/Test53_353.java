package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_353 {
    private final Production53_353 production = new Production53_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}