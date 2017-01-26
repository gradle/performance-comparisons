package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_33 {
    private final Production33_33 production = new Production33_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}