package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_215 {
    private final Production34_215 production = new Production34_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}