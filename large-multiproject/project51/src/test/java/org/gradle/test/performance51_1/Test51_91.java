package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_91 {
    private final Production51_91 production = new Production51_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}