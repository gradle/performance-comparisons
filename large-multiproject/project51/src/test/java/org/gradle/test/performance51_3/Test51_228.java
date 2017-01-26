package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_228 {
    private final Production51_228 production = new Production51_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}