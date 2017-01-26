package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_89 {
    private final Production51_89 production = new Production51_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}