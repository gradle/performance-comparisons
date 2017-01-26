package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_424 {
    private final Production33_424 production = new Production33_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}