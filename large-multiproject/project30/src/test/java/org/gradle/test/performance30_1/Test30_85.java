package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_85 {
    private final Production30_85 production = new Production30_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}