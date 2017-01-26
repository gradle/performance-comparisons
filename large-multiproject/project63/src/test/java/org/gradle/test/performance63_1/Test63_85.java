package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_85 {
    private final Production63_85 production = new Production63_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}