package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_85 {
    private final Production91_85 production = new Production91_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}