package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_36 {
    private final Production33_36 production = new Production33_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}