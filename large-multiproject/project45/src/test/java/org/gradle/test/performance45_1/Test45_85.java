package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_85 {
    private final Production45_85 production = new Production45_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}