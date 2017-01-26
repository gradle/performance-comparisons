package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_289 {
    private final Production51_289 production = new Production51_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}