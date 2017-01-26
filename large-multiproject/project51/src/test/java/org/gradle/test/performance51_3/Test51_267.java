package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_267 {
    private final Production51_267 production = new Production51_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}