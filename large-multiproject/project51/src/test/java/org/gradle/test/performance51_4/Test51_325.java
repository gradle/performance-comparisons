package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_325 {
    private final Production51_325 production = new Production51_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}