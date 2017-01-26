package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_215 {
    private final Production33_215 production = new Production33_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}