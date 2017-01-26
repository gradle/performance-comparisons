package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_419 {
    private final Production51_419 production = new Production51_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}