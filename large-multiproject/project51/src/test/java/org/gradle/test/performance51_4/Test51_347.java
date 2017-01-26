package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_347 {
    private final Production51_347 production = new Production51_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}