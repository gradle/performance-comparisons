package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_347 {
    private final Production78_347 production = new Production78_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}