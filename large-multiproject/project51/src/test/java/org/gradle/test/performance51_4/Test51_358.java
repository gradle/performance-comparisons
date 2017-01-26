package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_358 {
    private final Production51_358 production = new Production51_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}