package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_191 {
    private final Production51_191 production = new Production51_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}