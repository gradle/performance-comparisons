package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_173 {
    private final Production51_173 production = new Production51_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}