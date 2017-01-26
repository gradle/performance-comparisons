package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_85 {
    private final Production36_85 production = new Production36_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}