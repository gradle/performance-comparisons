package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_98 {
    private final Production51_98 production = new Production51_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}