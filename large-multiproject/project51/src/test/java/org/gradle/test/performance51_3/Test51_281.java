package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_281 {
    private final Production51_281 production = new Production51_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}