package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_100 {
    private final Production51_100 production = new Production51_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}