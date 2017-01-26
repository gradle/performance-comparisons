package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_215 {
    private final Production51_215 production = new Production51_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}