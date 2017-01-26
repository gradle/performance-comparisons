package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_68 {
    private final Production51_68 production = new Production51_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}