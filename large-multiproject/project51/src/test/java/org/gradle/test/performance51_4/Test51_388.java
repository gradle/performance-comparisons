package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_388 {
    private final Production51_388 production = new Production51_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}