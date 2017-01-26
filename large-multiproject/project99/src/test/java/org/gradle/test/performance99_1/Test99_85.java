package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_85 {
    private final Production99_85 production = new Production99_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}