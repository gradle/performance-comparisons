package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_183 {
    private final Production51_183 production = new Production51_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}