package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_45 {
    private final Production37_45 production = new Production37_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}