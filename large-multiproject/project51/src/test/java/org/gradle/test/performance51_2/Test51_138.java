package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_138 {
    private final Production51_138 production = new Production51_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}