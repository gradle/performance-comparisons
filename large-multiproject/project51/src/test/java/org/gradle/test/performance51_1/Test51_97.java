package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_97 {
    private final Production51_97 production = new Production51_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}