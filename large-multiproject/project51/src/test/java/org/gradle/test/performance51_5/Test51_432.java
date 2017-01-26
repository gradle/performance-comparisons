package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_432 {
    private final Production51_432 production = new Production51_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}