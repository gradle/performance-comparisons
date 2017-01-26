package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_495 {
    private final Production51_495 production = new Production51_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}