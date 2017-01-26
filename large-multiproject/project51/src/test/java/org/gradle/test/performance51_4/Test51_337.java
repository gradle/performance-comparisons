package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_337 {
    private final Production51_337 production = new Production51_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}