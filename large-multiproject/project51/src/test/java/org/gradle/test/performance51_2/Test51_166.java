package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_166 {
    private final Production51_166 production = new Production51_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}