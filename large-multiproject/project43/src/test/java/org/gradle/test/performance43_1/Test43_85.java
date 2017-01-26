package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_85 {
    private final Production43_85 production = new Production43_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}