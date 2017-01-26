package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_215 {
    private final Production19_215 production = new Production19_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}