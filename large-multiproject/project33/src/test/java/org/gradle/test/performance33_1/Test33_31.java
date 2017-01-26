package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_31 {
    private final Production33_31 production = new Production33_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}