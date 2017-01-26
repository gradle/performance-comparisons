package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_168 {
    private final Production51_168 production = new Production51_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}