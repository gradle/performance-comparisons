package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_191 {
    private final Production33_191 production = new Production33_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}