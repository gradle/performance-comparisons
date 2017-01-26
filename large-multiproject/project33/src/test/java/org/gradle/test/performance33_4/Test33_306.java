package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_306 {
    private final Production33_306 production = new Production33_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}