package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_356 {
    private final Production51_356 production = new Production51_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}