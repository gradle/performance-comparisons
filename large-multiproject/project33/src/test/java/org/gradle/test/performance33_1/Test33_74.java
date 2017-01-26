package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_74 {
    private final Production33_74 production = new Production33_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}