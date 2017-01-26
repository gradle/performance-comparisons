package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_465 {
    private final Production51_465 production = new Production51_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}