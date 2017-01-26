package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_353 {
    private final Production37_353 production = new Production37_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}