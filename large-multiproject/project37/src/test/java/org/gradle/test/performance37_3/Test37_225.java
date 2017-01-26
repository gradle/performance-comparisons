package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_225 {
    private final Production37_225 production = new Production37_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}