package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_85 {
    private final Production50_85 production = new Production50_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}