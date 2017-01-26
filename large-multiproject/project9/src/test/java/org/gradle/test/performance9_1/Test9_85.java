package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_85 {
    private final Production9_85 production = new Production9_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}