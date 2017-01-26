package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_266 {
    private final Production51_266 production = new Production51_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}