package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_234 {
    private final Production53_234 production = new Production53_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}