package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_215 {
    private final Production11_215 production = new Production11_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}