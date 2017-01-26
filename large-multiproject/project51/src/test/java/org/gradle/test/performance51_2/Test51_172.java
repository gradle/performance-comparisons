package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_172 {
    private final Production51_172 production = new Production51_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}