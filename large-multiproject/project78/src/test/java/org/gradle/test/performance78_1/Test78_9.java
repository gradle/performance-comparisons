package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_9 {
    private final Production78_9 production = new Production78_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}