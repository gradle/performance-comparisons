package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_288 {
    private final Production51_288 production = new Production51_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}