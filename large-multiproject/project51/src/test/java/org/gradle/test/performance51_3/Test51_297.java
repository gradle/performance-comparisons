package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_297 {
    private final Production51_297 production = new Production51_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}