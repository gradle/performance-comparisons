package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_415 {
    private final Production51_415 production = new Production51_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}